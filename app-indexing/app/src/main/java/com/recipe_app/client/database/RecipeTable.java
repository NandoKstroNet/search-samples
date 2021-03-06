/*
 * Copyright 2014 Google Inc. All Rights Reserved.
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

package com.recipe_app.client.database;


/**
 * Created by simister on 10/21/14.
 */
public class RecipeTable {

    // Database table
    public static final String TABLE = "recipes";
    public static final String ID = TABLE + "._id";
    public static final String TITLE = TABLE + ".title";
    public static final String PHOTO = TABLE + ".photo";
    public static final String PREP_TIME = TABLE + ".prep_time";
    public static final String DESCRIPTION = TABLE + ".description";

}
