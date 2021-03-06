/*
 * Copyright 2013-2015 pushbit <pushbit@gmail.com>
 * 
 * This file is part of Sprockets.
 * 
 * Sprockets is free software: you can redistribute it and/or modify it under the terms of the GNU
 * Lesser General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 * 
 * Sprockets is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with Sprockets. If
 * not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.sprockets.lang;

/**
 * Utility methods for working with mathematical operations.
 * 
 * @since 1.2.0
 */
public class Maths {
	private Maths() {
	}

	/**
	 * Get the value if it is between min and max, min if the value is less than min, or max if the
	 * value is greater than max.
	 */
	public static int clamp(int value, int min, int max) {
		return Math.min(Math.max(min, value), max);
	}

	/**
	 * Get the value if it is between min and max, min if the value is less than min, or max if the
	 * value is greater than max.
	 */
	public static long clamp(long value, long min, long max) {
		return Math.min(Math.max(min, value), max);
	}

	/**
	 * Get the value if it is between min and max, min if the value is less than min, or max if the
	 * value is greater than max.
	 */
	public static float clamp(float value, float min, float max) {
		return Math.min(Math.max(min, value), max);
	}

	/**
	 * Get the value if it is between min and max, min if the value is less than min, or max if the
	 * value is greater than max.
	 */
	public static double clamp(double value, double min, double max) {
		return Math.min(Math.max(min, value), max);
	}

	/**
	 * Get the value if it is between min and max or a value that is rolled over into min and max.
	 * 
	 * <pre><code> rollover(4, 5, 10)  // 10
	 * rollover(3, 5, 10)  // 9
	 * rollover(11, 5, 10) // 5
	 * rollover(12, 5, 10) // 6</code></pre>
	 * 
	 * @since 2.3.0
	 */
	public static int rollover(int value, int min, int max) {
		if (value < min) {
			int roll = (min - value) % (max - min + 1);
			return roll != 0 ? max + 1 - roll : min;
		} else if (value > max) {
			int roll = (value - max) % (max - min + 1);
			return roll != 0 ? min - 1 + roll : max;
		}
		return value;
	}
}
