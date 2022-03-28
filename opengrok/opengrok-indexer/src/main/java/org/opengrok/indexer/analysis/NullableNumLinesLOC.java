/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License (the "License").
 * You may not use this file except in compliance with the License.
 *
 * See LICENSE.txt included in this distribution for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at LICENSE.txt.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information: Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 */

/*
 * Copyright (c) 2020, Chris Fraire <cfraire@me.com>.
 */
package org.opengrok.indexer.analysis;

/**
 * Represents an immutable data object that associates a file with its analyzed
 * number-of-lines and lines-of-code or with null values.
 */
public class NullableNumLinesLOC {
    private final String path;
    private final Long numLines;
    private final Long loc;

    public NullableNumLinesLOC(String path, Long numLines, Long loc) {
        this.path = path;
        this.numLines = numLines;
        this.loc = loc;
    }

    public String getPath() {
        return path;
    }

    public Long getNumLines() {
        return numLines;
    }

    public Long getLOC() {
        return loc;
    }
}
