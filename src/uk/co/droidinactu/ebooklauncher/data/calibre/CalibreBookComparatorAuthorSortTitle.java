/*
 * Copyright 2012 Andy Aspell-Clark
 *
 * This file is part of eBookLauncher.
 * 
 * eBookLauncher is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * 
 * eBookLauncher is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with eBookLauncher. If not, see http://www.gnu.org/licenses/.
 *
 */
package uk.co.droidinactu.ebooklauncher.data.calibre;

import java.util.Comparator;

/**
 * sort by Author_sort field, followed by title
 */
public class CalibreBookComparatorAuthorSortTitle implements Comparator<CalibreBook> {

    @Override
    public int compare(final CalibreBook o1, final CalibreBook o2) {
        final String c1 = o1.author_sort + ":" + o1.title;
        final String c2 = o2.author_sort + ":" + o2.title;
        return c1.compareTo(c2);
    }
}
