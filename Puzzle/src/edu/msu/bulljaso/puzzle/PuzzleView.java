package edu.msu.bulljaso.puzzle;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class PuzzleView extends View 
{
	
	/**
	 * The actual puzzle
	 */
	private Puzzle puzzle;

	public PuzzleView(Context context) 
	{
		super(context);
		init(context);
	}

	public PuzzleView(Context context, AttributeSet attrs) 
	{
		super(context, attrs);
		init(context);
	}

	public PuzzleView(Context context, AttributeSet attrs, int defStyleAttr) 
	{
		super(context, attrs, defStyleAttr);
		init(context);
	}
	
	private void init(Context context) 
	{
		puzzle = new Puzzle(context);
		
	}
	
	@Override
	public void onDraw(Canvas canvas) 
	{
		super.onDraw(canvas);
		
		puzzle.draw(canvas);
	}

}
