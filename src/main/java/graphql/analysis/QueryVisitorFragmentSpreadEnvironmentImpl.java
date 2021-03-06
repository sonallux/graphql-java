package graphql.analysis;

import graphql.Internal;
import graphql.language.FragmentDefinition;
import graphql.language.FragmentSpread;
import graphql.language.Node;
import graphql.schema.GraphQLSchema;
import graphql.util.TraverserContext;

import java.util.Objects;

@Internal
public class QueryVisitorFragmentSpreadEnvironmentImpl implements QueryVisitorFragmentSpreadEnvironment {

    private final FragmentSpread fragmentSpread;
    private final FragmentDefinition fragmentDefinition;
    private final TraverserContext<Node> traverserContext;
    private final GraphQLSchema schema;


    public QueryVisitorFragmentSpreadEnvironmentImpl(FragmentSpread fragmentSpread, FragmentDefinition fragmentDefinition, TraverserContext<Node> traverserContext, GraphQLSchema schema) {
        this.fragmentSpread = fragmentSpread;
        this.fragmentDefinition = fragmentDefinition;
        this.traverserContext = traverserContext;
        this.schema = schema;
    }

    @Override
    public GraphQLSchema getSchema() {
        return schema;
    }

    @Override
    public FragmentSpread getFragmentSpread() {
        return fragmentSpread;
    }

    @Override
    public FragmentDefinition getFragmentDefinition() {
        return fragmentDefinition;
    }

    @Override
    public TraverserContext<Node> getTraverserContext() {
        return traverserContext;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QueryVisitorFragmentSpreadEnvironmentImpl that = (QueryVisitorFragmentSpreadEnvironmentImpl) o;
        return Objects.equals(fragmentSpread, that.fragmentSpread);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(fragmentSpread);
    }
}

