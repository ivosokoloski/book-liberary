package mk.ukim.finki.wp.eimt_lab.model.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Book.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Book_ extends mk.ukim.finki.wp.eimt_lab.model.domain.BaseAuditableEntity_ {

	public static final String GRAPH_BOOK_AUTHOR_COUNTRY_GRAPH = "book-author-country-graph";
	public static final String RENTED = "rented";
	public static final String AUTHOR = "author";
	public static final String AVAILABLE_COPIES = "availableCopies";
	public static final String NAME = "name";
	public static final String STATE = "state";
	public static final String CATEGORY = "category";

	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.Book#rented
	 **/
	public static volatile SingularAttribute<Book, Boolean> rented;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.Book#author
	 **/
	public static volatile SingularAttribute<Book, Author> author;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.Book#availableCopies
	 **/
	public static volatile SingularAttribute<Book, Integer> availableCopies;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.Book#name
	 **/
	public static volatile SingularAttribute<Book, String> name;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.Book#state
	 **/
	public static volatile SingularAttribute<Book, BookState> state;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.Book#category
	 **/
	public static volatile SingularAttribute<Book, BookCategory> category;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.Book
	 **/
	public static volatile EntityType<Book> class_;

}

