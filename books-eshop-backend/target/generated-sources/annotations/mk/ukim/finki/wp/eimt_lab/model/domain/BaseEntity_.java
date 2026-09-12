package mk.ukim.finki.wp.eimt_lab.model.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.MappedSuperclassType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(BaseEntity.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class BaseEntity_ {

	public static final String ID = "id";

	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.BaseEntity#id
	 **/
	public static volatile SingularAttribute<BaseEntity, Long> id;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.BaseEntity
	 **/
	public static volatile MappedSuperclassType<BaseEntity> class_;

}

