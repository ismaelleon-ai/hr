package com.ontimize.hr.api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IOfferService {

    // OFFER
    EntityResult offerQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;

    EntityResult offerInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

    EntityResult offerUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

    EntityResult offerDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

    // OFFER STATUS
    EntityResult offerStatusQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;

    EntityResult offerStatusInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

    EntityResult offerStatusUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

    EntityResult offerStatusDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

    // OFFER CANDIDATES
    EntityResult offerCandidateQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;

    EntityResult offerCandidateInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

    EntityResult offerCandidateUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

    EntityResult offerCandidateDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

    // OFFER CANDIDATES STATUS
    EntityResult offerCandidateStatusQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;

    EntityResult offerCandidateStatusInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;

    EntityResult offerCandidateStatusUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

    EntityResult offerCandidateStatusDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
}