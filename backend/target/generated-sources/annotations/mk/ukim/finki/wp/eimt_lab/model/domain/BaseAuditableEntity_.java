package mk.ukim.finki.wp.eimt_lab.model.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.MappedSuperclassType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(BaseAuditableEntity.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class BaseAuditableEntity_ extends mk.ukim.finki.wp.eimt_lab.model.domain.BaseEntity_ {

	public static final String CREATED_AT = "createdAt";
	public static final String UPDATED_AT = "updatedAt";

	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.BaseAuditableEntity#createdAt
	 **/
	public static volatile SingularAttribute<BaseAuditableEntity, LocalDateTime> createdAt;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.BaseAuditableEntity
	 **/
	public static volatile MappedSuperclassType<BaseAuditableEntity> class_;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.BaseAuditableEntity#updatedAt
	 **/
	public static volatile SingularAttribute<BaseAuditableEntity, LocalDateTime> updatedAt;

}

