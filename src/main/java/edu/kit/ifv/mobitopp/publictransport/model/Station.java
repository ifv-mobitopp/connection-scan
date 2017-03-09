package edu.kit.ifv.mobitopp.publictransport.model;

import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import edu.kit.ifv.mobitopp.network.Node;

public interface Station {

	int id();
	
	RelativeTime minimumChangeTime(int id);

	Collection<Stop> stops();
	
	void add(Stop newStop);

	void forEach(Consumer<Stop> action);

	void forEachNode(Consumer<Node> consumer);
	
	void forEachNode(BiConsumer<Node, Station> consumer);

}