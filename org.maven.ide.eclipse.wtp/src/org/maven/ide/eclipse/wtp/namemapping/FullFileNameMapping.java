/*******************************************************************************
 * Copyright (c) 2008 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.maven.ide.eclipse.wtp.namemapping;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.artifact.Artifact;

/**
 * A full file name mapping, useful if artifacts might have the same
 * name across groups.
 *
 * @author <a href="snicoll@apache.org">Stephane Nicoll</a>
 * @version $Id: FullFileNameMapping.java 992847 2010-09-05 18:16:55Z snicoll $
 */
public class FullFileNameMapping
    extends AbstractFileNameMapping
{

    public String mapFileName( final Artifact a )
    {
        final String dashedGroupId = a.getGroupId().replace( '.', '-' );
        return dashedGroupId + "-" + generateFileName( a, true );
    }
}
