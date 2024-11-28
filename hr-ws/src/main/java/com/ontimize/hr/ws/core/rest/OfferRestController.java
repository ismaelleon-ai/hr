package com.ontimize.hr.ws.core.rest;

import com.ontimize.hr.api.core.service.IOfferService;
import com.ontimize.hr.model.core.dao.OfferDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.server.rest.ORestController;
import com.ontimize.jee.common.db.SQLStatementBuilder.BasicExpression;
import com.ontimize.jee.common.db.SQLStatementBuilder.BasicField;
import com.ontimize.jee.common.db.SQLStatementBuilder.BasicOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.*;
import java.util.List;

@RestController
@RequestMapping("/offers")
public class OfferRestController extends ORestController<IOfferService> {

    @Autowired
    private IOfferService offerService;

    @Override
    public IOfferService getService() {
        return this.offerService;
    }

    @RequestMapping(value = "currentOffers/search", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public EntityResult currentOfferSearch(@RequestBody Map<String, Object> req){
        Map<String, Object> keyMap = new HashMap<>();
        List<String> attrList = (List<String>) req.get("columns");
        return offerService.offerQuery(keyMap, attrList);

    }

    public BasicExpression searchBetween(String param){

        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);

        return this.searchBetweenWithYear(param, currentYear);
    }

    private BasicExpression searchBetweenWithYear(String param, int year) {

        Calendar cal = Calendar.getInstance();
        cal.set(year, Calendar.JANUARY, 1, 0, 0, 0);
        Date startDate = cal.getTime();
        cal.set(year+1, Calendar.JANUARY, 1, 0, 0, 0);
        Date endDate = cal.getTime();

        BasicField field = new BasicField(param);
        BasicExpression bexp1 = new BasicExpression(field, BasicOperator.MORE_EQUAL_OP, startDate);
        BasicExpression bexp2 = new BasicExpression(field, BasicOperator.LESS_OP, endDate);
        return new BasicExpression(bexp1, BasicOperator.AND_OP, bexp2);
    }

}
