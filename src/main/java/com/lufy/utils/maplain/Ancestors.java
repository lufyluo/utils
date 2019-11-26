package com.lufy.utils.maplain;

import java.util.List;

/**
 * @Author lufy
 * @Description ...
 * @Date 19-10-25 上午9:59
 */
public class Ancestors<T extends Ancestors> {
    private Long id;
    private Long parentId;
    private List<T> children;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public List<T> getChildren() {
        return children;
    }

    public void setChildren(List<T> children) {
        this.children = children;
    }
}
