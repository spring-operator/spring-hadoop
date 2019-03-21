/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.yarn.config.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.yarn.YarnSystemConstants;
import org.springframework.yarn.client.YarnClient;
import org.springframework.yarn.config.annotation.EnableYarn;

/**
 * Specific configuration extension for {@link YarnClient}.
 *
 * @author Janne Valkealahti
 * @see EnableYarn
 * @see SpringYarnConfiguration
 * @see YarnClient
 *
 */
@Configuration
public class SpringYarnClientConfiguration extends SpringYarnConfiguration {

	@Bean(name=YarnSystemConstants.DEFAULT_ID_CLIENT)
	@DependsOn(YarnSystemConstants.DEFAULT_ID_CONFIGURATION)
	public YarnClient yarnClient() throws Exception {
		return builder.getOrBuild().getYarnClient();
	}

}
