/*
 * file:       BaseCalendarHour.java
 * author:     Scott Melville
 *             Jon Iles
 * copyright:  (c) Tapster Rock Limited 2002-2003
 * date:       15/08/2002
 */

/*
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation; either version 2.1 of the License, or (at your
 * option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 */

package com.tapsterrock.mpx;

import java.util.Date;

/**
 * This class is used to represent the records in an MPX file that define
 * working hours.
 */
public class BaseCalendarHours extends MPXRecord
{
   /**
    * Default constructor.
    *
    * @param file the parent file to which this record belongs.
    */
   BaseCalendarHours (MPXFile file)
   {
      super(file);
   }

   /**
    * Constructor used to create an instance of this class from data
    * taken from an MPXFile record.
    *
    * @param file the MPXFile object to which this record belongs.
    * @param record record containing the data for  this object.
    */
   BaseCalendarHours (MPXFile file, Record record)
      throws MPXException
   {
      super(file);

      setDay(record.getByte(0));
      setFromTime1(record.getTime(1));
      setToTime1(record.getTime(2));
      setFromTime2(record.getTime(3));
      setToTime2(record.getTime(4));
      setFromTime3(record.getTime(5));
      setToTime3(record.getTime(6));
   }


   /**
    * Get day 0-sunday....6-saturday
    *
    * @return byte value of day
    */
   public byte getDay ()
   {
      return (((Byte)get(DAY)).byteValue());
   }

   /**
    * Set day 0-sunday....6-saturday
    *
    * @param d byte value of day
    */
   public void setDay (Byte d)
   {
      put (DAY,d);
   }

   /**
    * Get FromTime1
    *
    * @return Time
    */
   public Date getFromTime1()
   {
      return ((Date)get(FROM_TIME_1));
   }

   /**
    * Sets from time 1
    *
    * @param from Time
    */
   public void setFromTime1(Date from)
   {
      putTime (FROM_TIME_1,from);
   }

   /**
    * Get ToTime1
    *
    * @return Time
    */
   public Date getToTime1()
   {
      return ((Date)get(TO_TIME_1));
   }

   /**
    * Sets to time 1
    *
    * @param to Time
    */
   public void setToTime1 (Date to)
   {
      putTime (TO_TIME_1,to);
   }

   /**
    * Get FromTime2
    *
    * @return Time
    */
   public Date getFromTime2 ()
   {
      return ((Date)get(FROM_TIME_2));
   }

   /**
    * Sets from time 2
    *
    * @param from Time
    */
   public void setFromTime2 (Date from)
   {
      putTime (FROM_TIME_2,from);
   }

   /**
    * Get ToTime2
    *
    * @return Time
    */
   public Date getToTime2 ()
   {
      return ((Date)get(TO_TIME_2));
   }

   /**
    * Sets to time 2
    *
    * @param to Time
    */
   public void setToTime2 (Date to)
   {
      putTime (TO_TIME_2,to);
   }

   /**
    * Get FromTime3
    *
    * @return Time
    */
   public Date getFromTime3 ()
   {
      return ((Date)get(FROM_TIME_3));
   }

   /**
    * Sets from time 3
    *
    * @param from Time
    */
   public void setFromTime3 (Date from)
   {
      putTime (FROM_TIME_3,from);
   }

   /**
    * Get ToTime3
    *
    * @return Time
    */
   public Date getToTime3 ()
   {
      return ((Date)get(TO_TIME_3));
   }

   /**
    * Sets to time 3
    *
    * @param to Time
    */
   public void setToTime3 (Date to)
   {
      putTime (TO_TIME_3,to);
   }

   /**
    * This method generates a string in MPX format representing the
    * contents of this record.
    *
    * @return string containing the data for this record in MPX format.
    */
   public String toString ()
   {
      return (toString(RECORD_NUMBER));
   }

   /**
    * Constant for Sunday
    */
   public static final Byte SUNDAY = new Byte ((byte)1);

   /**
    * Constant for Monday
    */
   public static final Byte MONDAY = new Byte ((byte)2);

   /**
    * Constant for Tuesday
    */
   public static final Byte TUESDAY = new Byte ((byte)3);

   /**
    * Constant for Wednesday
    */
   public static final Byte WEDNESDAY = new Byte ((byte)4);

   /**
    * Constant for Thursday
    */
   public static final Byte THURSDAY = new Byte ((byte)5);

   /**
    * Constant for Friday
    */
   public static final Byte FRIDAY = new Byte ((byte)6);

   /**
    * Constant for Saturday
    */
   public static final Byte SATURDAY = new Byte ((byte)7);

   /**
    * Constant representing Day field.
    */
   private static final Integer DAY = new Integer(0);

   /**
    * Constant representing From Time 1 field.
    */
   private static final Integer FROM_TIME_1 = new Integer(1);

   /**
    * Constant representing To Time 1 field.
    */
   private static final Integer TO_TIME_1 = new Integer(2);

   /**
    * Constant representing From Time 2 field.
    */
   private static final Integer FROM_TIME_2 = new Integer(3);

   /**
    * Constant representing To Time 2 field.
    */
   private static final Integer TO_TIME_2 = new Integer(4);

   /**
    * Constant representing From Time 3 field.
    */
   private static final Integer FROM_TIME_3 = new Integer(5);

   /**
    * Constant representing To Time 3 field.
    */
   private static final Integer TO_TIME_3 = new Integer(6);

   /**
    * Constant containing the record number associated with this record.
    */
   public static final int RECORD_NUMBER = 25;
}