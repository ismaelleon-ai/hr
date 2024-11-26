package com.ontimize.hr.model.core.service;

import com.ontimize.hr.api.core.service.ICandidateService;
import com.ontimize.hr.model.core.dao.CandidateDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("CandidateService")
@Lazy
public class CandidateService implements ICandidateService {

    @Autowired
    private CandidateDao candidateDao;

    @Autowired
    private MasterService masterService;

    @Autowired
    private DefaultOntimizeDaoHelper daoHelper;

    @Override
    public EntityResult candidateQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException {
        return this.daoHelper.query(this.candidateDao, keyMap, attrList);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public EntityResult candidateInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
        Map<String, Object> nonRelatedData = removeNonRelatedData (attrMap, CandidateDao.ATTR_EDUCATION,CandidateDao.ATTR_EXPERIENCE_LEVEL, CandidateDao.ATTR_ORIGIN, CandidateDao.ATTR_PROFILE, CandidateDao.ATTR_STATUS)
        insertNonRelatedData(nonRelatedData);


        EntityResult insertCandidate = this.daoHelper.insert(this.candidateDao,attrMap);


        return insertCandidate;
    }

    private void insertNonRelatedData(Map<String, Object> nonCandidateData) {
        for (Map.Entry<String, Object> entry : nonCandidateData.entrySet()){

        }
    }

    private Map<String, Object> removeNonRelatedData(Map<String, Object> attrMap, String ... attrNonRelated) {
        Map<String, Object> data = new HashMap<>();
        for (String attr : attrNonRelated){
            if (attrMap.containsKey(attr) && attrMap.get(attr) instanceof String) {
                data.put(attr, attrMap.remove(attr));
            }
        }
        return data;
    }

    @Override
    public EntityResult candidateUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.update(this.candidateDao,attrMap,keyMap);
    }

    @Override
    public EntityResult candidateDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.delete(this.candidateDao,keyMap);
    }
}
