package mk.ukim.finki.wp.eimt_lab.model.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Author.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Author_ extends mk.ukim.finki.wp.eimt_lab.model.domain.BaseAuditableEntity_ {

	public static final String COUNTRY = "country";
	public static final String SURNAME = "surname";
	public static final String NAME = "name";

	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.Author#country
	 **/
	public static volatile SingularAttribute<Author, Country> country;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.Author#surname
	 **/
	public static volatile SingularAttribute<Author, String> surname;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.Author#name
	 **/
	public static volatile SingularAttribute<Author, String> name;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.Author
	 **/
	public static volatile EntityType<Author> class_;

}

