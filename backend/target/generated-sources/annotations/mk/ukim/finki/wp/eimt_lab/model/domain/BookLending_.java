package mk.ukim.finki.wp.eimt_lab.model.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(BookLending.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class BookLending_ {

	public static final String BOOK = "book";
	public static final String ID = "id";
	public static final String USER = "user";

	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.BookLending#book
	 **/
	public static volatile SingularAttribute<BookLending, Book> book;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.BookLending#id
	 **/
	public static volatile SingularAttribute<BookLending, Long> id;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.BookLending
	 **/
	public static volatile EntityType<BookLending> class_;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.BookLending#user
	 **/
	public static volatile SingularAttribute<BookLending, User> user;

}

