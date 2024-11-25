package com.ontimize.hr.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

import java.util.List;
import java.util.Map;

public interface IMasterService {

    // EDUCATION
    EntityResult educationQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;

    EntityResult educationInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

    EntityResult educationUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

    EntityResult educationDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

    // EXPERIENCE_LEVEL
    EntityResult experienceLevelQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;

    EntityResult experienceLevelInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

    EntityResult experienceLevelUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

    EntityResult experienceLevelDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

    // ORIGIN
    EntityResult originQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;

    EntityResult originInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

    EntityResult originUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

    EntityResult originDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

    // PROFILE
    EntityResult profileQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;

    EntityResult profileInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

    EntityResult profileUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

    EntityResult profileDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

    // STATUS
    EntityResult statusQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;

    EntityResult statusInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

    EntityResult statusUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

    EntityResult statusDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

}