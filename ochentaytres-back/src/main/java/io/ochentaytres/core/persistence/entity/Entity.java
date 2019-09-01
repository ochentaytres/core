package io.ochentaytres.core.persistence.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;

@MappedSuperclass
public class Entity implements Serializable {
    private static final long serialVersionUID = 1l;

    @Version
    @Column(name = "VERSION", nullable = true)
    private Long version;

    @Column(name = "ACTIVE_FLAG", nullable = true)
    private Boolean active = Boolean.TRUE;

    public Entity() {
        this.setActive(Boolean.TRUE);
    }

    public Long getVersion() {
        return version;
    }
    public void setVersion(Long version) {
        this.version = version;
    }

    public Boolean isActive(){
        return this.active;
    }
    public void setActive(Boolean active){
        this.active = active;
    }
}
