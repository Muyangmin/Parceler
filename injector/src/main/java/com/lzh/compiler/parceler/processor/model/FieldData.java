package com.lzh.compiler.parceler.processor.model;

import javax.lang.model.element.VariableElement;

public class FieldData {
    private String key;
    private boolean nonNull;
    private String methodName;
    private String castName;
    VariableElement var;

    public FieldData(String key, VariableElement var) {
        this.key = key;
        this.var = var;
    }

    public String getKey() {
        return key;
    }

    public VariableElement getVar() {
        return var;
    }

    public String getMethodName() {
        return methodName;
    }

    public FieldData setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }

    public String getCastName() {
        return castName;
    }

    public void setCastName(String castName) {
        this.castName = castName;
    }

    public boolean isNonNull() {
        return nonNull;
    }

    public void setNonNull(boolean nonNull) {
        this.nonNull = nonNull;
    }
}
