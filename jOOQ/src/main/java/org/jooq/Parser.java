/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq;

/**
 * This is experimental functionality.
 * <p>
 * While the parser API will probably not change between versions, the
 * functionality itself may be subject to change in future releases.
 *
 * @author Lukas Eder
 */
public interface Parser {

    /**
     * Parse a SQL string to a set of queries.
     */
    Queries parse(String sql);

    /**
     * Parse a SQL string to a query.
     */
    Query parseQuery(String sql);

    /**
     * Parse a SQL string to a result query.
     */
    ResultQuery<?> parseResultQuery(String sql);

    /**
     * Parse a SQL string to a table.
     */
    Table<?> parseTable(String sql);

    /**
     * Parse a SQL string to a field.
     */
    Field<?> parseField(String sql);

    /**
     * Parse a SQL string to a row.
     */
    Row parseRow(String sql);

    /**
     * Parse a SQL string to a condition.
     */
    Condition parseCondition(String sql);

    /**
     * Parse a SQL string to a name.
     */
    Name parseName(String sql);
}
