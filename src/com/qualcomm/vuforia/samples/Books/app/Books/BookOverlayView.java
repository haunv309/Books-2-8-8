/*==============================================================================
 Copyright (c) 2012-2013 Qualcomm Connected Experiences, Inc.
 All Rights Reserved.
 ==============================================================================*/

package com.qualcomm.vuforia.samples.Books.app.Books;

import com.qualcomm.vuforia.samples.Books.R;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Custom View with Book Overlay Data
public class BookOverlayView extends RelativeLayout
{
    public BookOverlayView(Context context)
    {
        this(context, null);
    }
    
    
    public BookOverlayView(Context context, AttributeSet attrs)
    {
        this(context, attrs, 0);
    }
    
    
    public BookOverlayView(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        inflateLayout(context);
        
    }
    
    
    // Inflates the Custom View Layout
    private void inflateLayout(Context context)
    {
        
        final LayoutInflater inflater = LayoutInflater.from(context);
        
        // Generates the layout for the view
        inflater.inflate(R.layout.bitmap_layout, this, true);
    }
    
    
    // Sets Book title in View
    public void setBookTitle(String bookTitle)
    {
        TextView tv = (TextView) findViewById(R.id.custom_view_title);
        tv.setText(bookTitle);
    }
    
    
    // Sets Book Author in View
    public void setBookAuthor(String bookAuthor)
    {
        TextView tv = (TextView) findViewById(R.id.custom_view_author);
        tv.setText(bookAuthor);
    }
    
    
    // Sets Book Price in View
    public void setBookPrice(String bookPrice)
    {
        TextView tv = (TextView) findViewById(R.id.custom_view_price_old);
        tv.setText(getContext().getString(R.string.string_$) + bookPrice);
    }
    
    
    // Sets Book Number of Ratings in View
    public void setBookRatingCount(String ratingCount)
    {
        TextView tv = (TextView) findViewById(R.id.custom_view_rating_text);
        tv.setText(getContext().getString(R.string.string_openParentheses)
            + ratingCount + getContext().getString(R.string.string_ratings)
            + getContext().getString(R.string.string_closeParentheses));
    }
    
    
    // Sets Book Special Price in View
    public void setYourPrice(String yourPrice)
    {
        TextView tv = (TextView) findViewById(R.id.badge_price_value);
        tv.setText(getContext().getString(R.string.string_$) + yourPrice);
    }
    
    
    // Sets Book Cover in View from a bitmap
    public void setCoverViewFromBitmap(Bitmap coverBook)
    {
        ImageView iv = (ImageView) findViewById(R.id.custom_view_book_cover);
        iv.setImageBitmap(coverBook);
    }
    
    
    // Sets Book Rating in View
    public void setRating(String rating)
    {
        RatingBar rb = (RatingBar) findViewById(R.id.custom_view_rating);
        rb.setRating(Float.parseFloat(rating));
    }
}
