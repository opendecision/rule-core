package com.opendecision.ruleengine.model;

import java.util.ArrayList;
import java.util.List;

public class Rule  {

    private String id;

    private boolean singlehit = true;

    private Condition condition;

    private RuleAction action;

    private List<LocalVariable> variables;

    private List<Rule> children = new ArrayList<>();

    public boolean isSinglehit() {
        return singlehit;
    }

    public void setSinglehit(boolean singlehit) {
        this.singlehit = singlehit;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public RuleAction getAction() {
        return action;
    }

    public void setAction(RuleAction action) {
        this.action = action;
    }

    public List<LocalVariable> getVariables() {
        return variables;
    }

    public void setVariables(List<LocalVariable> variables) {
        this.variables = variables;
    }

    public List<Rule> getChildren() {
        return children;
    }

    public void setChildren(List<Rule> children) {
        this.children = children;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
