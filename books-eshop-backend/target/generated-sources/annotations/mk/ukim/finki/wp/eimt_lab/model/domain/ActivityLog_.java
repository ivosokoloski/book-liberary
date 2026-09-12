package mk.ukim.finki.wp.eimt_lab.model.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(ActivityLog.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class ActivityLog_ {

	public static final String EVENT_TIME = "eventTime";
	public static final String ID = "id";
	public static final String EVENT_TYPE = "eventType";
	public static final String BOOK_NAME = "bookName";

	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.ActivityLog#eventTime
	 **/
	public static volatile SingularAttribute<ActivityLog, LocalDateTime> eventTime;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.ActivityLog#id
	 **/
	public static volatile SingularAttribute<ActivityLog, Long> id;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.ActivityLog#eventType
	 **/
	public static volatile SingularAttribute<ActivityLog, String> eventType;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.ActivityLog
	 **/
	public static volatile EntityType<ActivityLog> class_;
	
	/**
	 * @see mk.ukim.finki.wp.eimt_lab.model.domain.ActivityLog#bookName
	 **/
	public static volatile SingularAttribute<ActivityLog, String> bookName;

}

