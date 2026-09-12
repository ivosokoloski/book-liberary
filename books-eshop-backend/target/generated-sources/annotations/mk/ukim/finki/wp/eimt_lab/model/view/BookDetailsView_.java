package mk.ukim.finki.wp.eimt_lab.model.view;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import mk.ukim.finki.wp.eimt_lab.model.domain.BookCategory;
import mk.ukim.finki.wp.eimt_lab.model.domain.BookState;

@StaticMetamodel(BookDetailsView.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class BookDetailsView_ {

	public static final String AUTHOR_FULL_NAME = "authorFullName";
	public static final String AVAILABLE_COPIES = "availableCopies";
	public static final String ID = "id";
	public static final String STATE = "state";
	public static final String COUNTRY_NAME = "countryName";
	public static final String CATEGORY = "category";
	public static final String BOOK_NAME = "bookName";

	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.view.BookDetailsView#authorFullName
	 **/
	public static volatile SingularAttribute<BookDetailsView, String> authorFullName;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.view.BookDetailsView#availableCopies
	 **/
	public static volatile SingularAttribute<BookDetailsView, Integer> availableCopies;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.view.BookDetailsView#id
	 **/
	public static volatile SingularAttribute<BookDetailsView, Long> id;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.view.BookDetailsView#state
	 **/
	public static volatile SingularAttribute<BookDetailsView, BookState> state;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.view.BookDetailsView#countryName
	 **/
	public static volatile SingularAttribute<BookDetailsView, String> countryName;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.view.BookDetailsView#category
	 **/
	public static volatile SingularAttribute<BookDetailsView, BookCategory> category;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.view.BookDetailsView
	 **/
	public static volatile EntityType<BookDetailsView> class_;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.view.BookDetailsView#bookName
	 **/
	public static volatile SingularAttribute<BookDetailsView, String> bookName;

}

