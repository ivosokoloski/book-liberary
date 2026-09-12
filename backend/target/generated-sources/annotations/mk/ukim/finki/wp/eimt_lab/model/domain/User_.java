package mk.ukim.finki.wp.eimt_lab.model.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import mk.ukim.finki.wp.eimt_lab.model.enums.Role;

@StaticMetamodel(User.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class User_ extends mk.ukim.finki.wp.eimt_lab.model.domain.BaseAuditableEntity_ {

	public static final String PASSWORD = "password";
	public static final String ROLE = "role";
	public static final String SURNAME = "surname";
	public static final String NAME = "name";
	public static final String EMAIL = "email";
	public static final String USERNAME = "username";

	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.User#password
	 **/
	public static volatile SingularAttribute<User, String> password;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.User#role
	 **/
	public static volatile SingularAttribute<User, Role> role;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.User#surname
	 **/
	public static volatile SingularAttribute<User, String> surname;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.User#name
	 **/
	public static volatile SingularAttribute<User, String> name;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.User
	 **/
	public static volatile EntityType<User> class_;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.User#email
	 **/
	public static volatile SingularAttribute<User, String> email;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.User#username
	 **/
	public static volatile SingularAttribute<User, String> username;

}

