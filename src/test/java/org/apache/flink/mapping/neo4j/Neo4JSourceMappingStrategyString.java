package org.apache.flink.mapping.neo4j;

import org.apache.flink.mapping.neo4j.Neo4JSerializationMappingStrategy;
import org.apache.flink.mapping.neo4j.SerializationMapper;

public class Neo4JSourceMappingStrategyString extends Neo4JSerializationMappingStrategy<String, SerializationMapper<String>> {

	private static final long serialVersionUID = 1L;

	public Neo4JSourceMappingStrategyString(String templateStatement, SerializationMapper<String> mapper) {
		super(templateStatement, mapper);
	}
}