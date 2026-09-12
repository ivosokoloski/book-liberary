package mk.ukim.finki.wp.eimt_lab.model.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Country.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Country_ extends mk.ukim.finki.wp.eimt_lab.model.domain.BaseEntity_ {

	public static final String CONTINENT = "continent";
	public static final String NAME = "name";

	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.Country#continent
	 **/
	public static volatile SingularAttribute<Country, String> continent;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.Country#name
	 **/
	public static volatile SingularAttribute<Country, String> name;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.Country
	 **/
	public static volatile EntityType<Country> class_;

}

