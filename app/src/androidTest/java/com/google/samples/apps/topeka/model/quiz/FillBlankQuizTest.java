/*
 * Copyright 2015 Google Inc.
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
package com.google.samples.apps.topeka.model.quiz;

public class FillBlankQuizTest extends AbsQuizTestCase<FillBlankQuiz> {

    private static final String ANSWER = "answer";
    private static final String START = "start";
    private static final String END = "end";

    @Override
    public FillBlankQuiz getQuiz() {
        return new FillBlankQuiz(QUESTION, ANSWER, START, END, false);
    }
}