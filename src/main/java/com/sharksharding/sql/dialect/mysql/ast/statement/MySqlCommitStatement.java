/*
 * Copyright 1999-2101 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sharksharding.sql.dialect.mysql.ast.statement;

import com.sharksharding.sql.dialect.mysql.visitor.MySqlASTVisitor;

public class MySqlCommitStatement extends MySqlStatementImpl {

    private boolean work = false;

    private Boolean chain;
    private Boolean release;

    public Boolean getChain() {
        return chain;
    }

    public void setChain(Boolean chain) {
        this.chain = chain;
    }

    public Boolean getRelease() {
        return release;
    }

    public void setRelease(Boolean release) {
        this.release = release;
    }

    public boolean isWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }

    public void accept0(MySqlASTVisitor visitor) {
        visitor.visit(this);

        visitor.endVisit(this);
    }
}