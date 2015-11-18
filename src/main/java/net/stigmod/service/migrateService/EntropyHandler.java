/*
 * Copyright 2014-2016, Stigmergic-Modeling Project
 * SEIDR, Peking University
 * All rights reserved
 *
 * Stigmergic-Modeling is used for collaborative groups to create a conceptual model.
 * It is based on UML 2.0 class diagram specifications and stigmergy theory.
 */

package net.stigmod.service.migrateService;

import net.stigmod.domain.relationship.ClassToValueEdge;
import net.stigmod.domain.relationship.RelationToCEdge;
import net.stigmod.domain.relationship.RelationToValueEdge;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 *
 * @version     2015/11/12
 * @author 	    Kai Fu
 */
public interface EntropyHandler {
    public Double computeClassEntropy(Long id);
    public Double computeRelationEntropy(Long id);
    public Double computeValueEntropy(Long id);

    public Double computeSystemEntropy();

    public Map<String,List<Set<Long>>> getMapForClassNode(Set<ClassToValueEdge> ctvEdges,Set<RelationToCEdge> rtcEdges);
    public Map<String,List<Set<Long>>> getMapForRelationNode(Set<RelationToCEdge> rtcEdges,Set<RelationToValueEdge> rtvEdges);
    public Map<String,List<Set<Long>>> getMapForValueNode(Set<ClassToValueEdge> ctvEdges,Set<RelationToValueEdge> rtvEdges);

    public Double compueteMapEntropy(Map<String,List<Set<Long>>> myMap);
}
