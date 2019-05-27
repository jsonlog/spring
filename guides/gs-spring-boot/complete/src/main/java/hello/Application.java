package hello;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }

}
/*

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.4.RELEASE)

2019-05-27 15:20:50.377  INFO 79829 --- [           main] hello.Application                        : Starting Application on ...
2019-05-27 15:20:50.385  INFO 79829 --- [           main] hello.Application                        : No active profile set, falling back to default profiles: default
2019-05-27 15:20:54.061  INFO 79829 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2019-05-27 15:20:54.120  INFO 79829 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2019-05-27 15:20:54.121  INFO 79829 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.17]
2019-05-27 15:20:54.326  INFO 79829 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2019-05-27 15:20:54.326  INFO 79829 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 3835 ms
2019-05-27 15:20:55.387  INFO 79829 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2019-05-27 15:20:56.083  INFO 79829 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoint(s) beneath base path '/actuator'
2019-05-27 15:20:56.270  INFO 79829 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2019-05-27 15:20:56.275  INFO 79829 --- [           main] hello.Application                        : Started Application in 7.3 seconds (JVM running for 9.835)
Let's inspect the beans provided by Spring Boot:
application
applicationTaskExecutor
auditEventRepository
auditEventsEndpoint
auditListener
basicErrorController
beanNameHandlerMapping
beanNameViewResolver
beansEndpoint
cachesEndpoint
cachesEndpointWebExtension
characterEncodingFilter
classLoaderMetrics
commandLineRunner
conditionsReportEndpoint
configurationPropertiesReportEndpoint
controllerEndpointDiscoverer
controllerEndpointHandlerMapping
controllerExposeExcludePropertyEndpointFilter
conventionErrorViewResolver
createHealthStatusHttpMapper
defaultServletHandlerMapping
defaultValidator
defaultViewResolver
diskSpaceHealthIndicator
diskSpaceHealthIndicatorProperties
dispatcherServlet
dispatcherServletMappingDescriptionProvider
dispatcherServletRegistration
dumpEndpoint
endpointCachingOperationInvokerAdvisor
endpointMediaTypes
endpointOperationParameterMapper
envInfoContributor
environmentEndpoint
environmentEndpointWebExtension
error
errorAttributes
errorPageCustomizer
errorPageRegistrarBeanPostProcessor
faviconHandlerMapping
faviconRequestHandler
fileDescriptorMetrics
filterMappingDescriptionProvider
formContentFilter
handlerExceptionResolver
healthAggregator
healthEndpoint
healthEndpointWebExtension
healthIndicatorRegistry
healthWebEndpointResponseMapper
heapDumpWebEndpoint
helloController
hiddenHttpMethodFilter
httpExchangeTracer
httpRequestHandlerAdapter
httpTraceEndpoint
httpTraceFilter
infoEndpoint
jacksonCodecCustomizer
jacksonObjectMapper
jacksonObjectMapperBuilder
jmxAnnotationEndpointDiscoverer
jmxIncludeExcludePropertyEndpointFilter
jmxMBeanExporter
jsonComponentModule
jvmGcMetrics
jvmMemoryMetrics
jvmThreadMetrics
localeCharsetMappingsCustomizer
logbackMetrics
loggersEndpoint
loggingCodecCustomizer
management.endpoint.configprops-org.springframework.boot.actuate.autoconfigure.context.properties.ConfigurationPropertiesReportEndpointProperties
management.endpoint.env-org.springframework.boot.actuate.autoconfigure.env.EnvironmentEndpointProperties
management.endpoint.health-org.springframework.boot.actuate.autoconfigure.health.HealthEndpointProperties
management.endpoint.logfile-org.springframework.boot.actuate.autoconfigure.logging.LogFileWebEndpointProperties
management.endpoints.jmx-org.springframework.boot.actuate.autoconfigure.endpoint.jmx.JmxEndpointProperties
management.endpoints.web-org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointProperties
management.endpoints.web.cors-org.springframework.boot.actuate.autoconfigure.endpoint.web.CorsEndpointProperties
management.health.status-org.springframework.boot.actuate.autoconfigure.health.HealthIndicatorProperties
management.info-org.springframework.boot.actuate.autoconfigure.info.InfoContributorProperties
management.metrics-org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties
management.metrics.export.simple-org.springframework.boot.actuate.autoconfigure.metrics.export.simple.SimpleProperties
management.server-org.springframework.boot.actuate.autoconfigure.web.server.ManagementServerProperties
management.trace.http-org.springframework.boot.actuate.autoconfigure.trace.http.HttpTraceProperties
managementServletContext
mappingJackson2HttpMessageConverter
mappingsEndpoint
mbeanExporter
mbeanServer
messageConverters
meterRegistryPostProcessor
methodValidationPostProcessor
metricsEndpoint
metricsHttpClientUriTagFilter
metricsHttpServerUriTagFilter
metricsRestTemplateCustomizer
metricsWebMvcConfigurer
micrometerClock
multipartConfigElement
multipartResolver
mvcContentNegotiationManager
mvcConversionService
mvcHandlerMappingIntrospector
mvcPathMatcher
mvcResourceUrlProvider
mvcUriComponentsContributor
mvcUrlPathHelper
mvcValidator
mvcViewResolver
objectNamingStrategy
org.springframework.boot.actuate.autoconfigure.audit.AuditAutoConfiguration
org.springframework.boot.actuate.autoconfigure.audit.AuditAutoConfiguration$AuditEventRepositoryConfiguration
org.springframework.boot.actuate.autoconfigure.audit.AuditEventsEndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.beans.BeansEndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.cache.CachesEndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.condition.ConditionsReportEndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.context.properties.ConfigurationPropertiesReportEndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.endpoint.EndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.endpoint.jmx.JmxEndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.endpoint.web.ServletEndpointManagementContextConfiguration
org.springframework.boot.actuate.autoconfigure.endpoint.web.ServletEndpointManagementContextConfiguration$WebMvcServletEndpointManagementContextConfiguration
org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.endpoint.web.WebEndpointAutoConfiguration$WebEndpointServletConfiguration
org.springframework.boot.actuate.autoconfigure.endpoint.web.servlet.WebMvcEndpointManagementContextConfiguration
org.springframework.boot.actuate.autoconfigure.env.EnvironmentEndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.health.HealthEndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.health.HealthEndpointConfiguration
org.springframework.boot.actuate.autoconfigure.health.HealthEndpointWebExtensionConfiguration
org.springframework.boot.actuate.autoconfigure.health.HealthEndpointWebExtensionConfiguration$ServletWebHealthConfiguration
org.springframework.boot.actuate.autoconfigure.health.HealthIndicatorAutoConfiguration
org.springframework.boot.actuate.autoconfigure.info.InfoContributorAutoConfiguration
org.springframework.boot.actuate.autoconfigure.info.InfoEndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.logging.LogFileWebEndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.logging.LoggersEndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.management.HeapDumpWebEndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.management.ThreadDumpEndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.CompositeMeterRegistryAutoConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.JvmMetricsAutoConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.LogbackMetricsAutoConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.MetricsAutoConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.MetricsEndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.SystemMetricsAutoConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.export.simple.SimpleMetricsExportAutoConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.web.client.HttpClientMetricsAutoConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.web.client.RestTemplateMetricsConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.web.servlet.WebMvcMetricsAutoConfiguration
org.springframework.boot.actuate.autoconfigure.metrics.web.tomcat.TomcatMetricsAutoConfiguration
org.springframework.boot.actuate.autoconfigure.scheduling.ScheduledTasksEndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.system.DiskSpaceHealthIndicatorAutoConfiguration
org.springframework.boot.actuate.autoconfigure.trace.http.HttpTraceAutoConfiguration
org.springframework.boot.actuate.autoconfigure.trace.http.HttpTraceAutoConfiguration$ServletTraceFilterConfiguration
org.springframework.boot.actuate.autoconfigure.trace.http.HttpTraceEndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.web.mappings.MappingsEndpointAutoConfiguration
org.springframework.boot.actuate.autoconfigure.web.mappings.MappingsEndpointAutoConfiguration$ServletWebConfiguration
org.springframework.boot.actuate.autoconfigure.web.mappings.MappingsEndpointAutoConfiguration$ServletWebConfiguration$SpringMvcConfiguration
org.springframework.boot.actuate.autoconfigure.web.server.ManagementContextAutoConfiguration
org.springframework.boot.actuate.autoconfigure.web.server.ManagementContextAutoConfiguration$SameManagementContextConfiguration
org.springframework.boot.actuate.autoconfigure.web.server.ManagementContextAutoConfiguration$SameManagementContextConfiguration$EnableSameManagementContextConfiguration
org.springframework.boot.actuate.autoconfigure.web.servlet.ServletManagementContextAutoConfiguration
org.springframework.boot.autoconfigure.AutoConfigurationPackages
org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration
org.springframework.boot.autoconfigure.condition.BeanTypeRegistry
org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration
org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration
org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration
org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration$StringHttpMessageConverterConfiguration
org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration
org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration$MappingJackson2HttpMessageConverterConfiguration
org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration
org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration$JacksonCodecConfiguration
org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration$LoggingCodecConfiguration
org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration
org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory
org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration
org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$Jackson2ObjectMapperBuilderCustomizerConfiguration
org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperBuilderConfiguration
org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperConfiguration
org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$ParameterNamesModuleConfiguration
org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration
org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration
org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration
org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration
org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration
org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration
org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration$TomcatWebServerFactoryCustomizerConfiguration
org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration
org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletConfiguration
org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletRegistrationConfiguration
org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration
org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration
org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration
org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryConfiguration$EmbeddedTomcat
org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration
org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$EnableWebMvcConfiguration
org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter
org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter$FaviconConfiguration
org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration
org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration
org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration
org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration
org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration$TomcatWebSocketConfiguration
org.springframework.boot.context.properties.ConfigurationBeanFactoryMetadata
org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor
org.springframework.context.annotation.internalAutowiredAnnotationProcessor
org.springframework.context.annotation.internalCommonAnnotationProcessor
org.springframework.context.annotation.internalConfigurationAnnotationProcessor
org.springframework.context.event.internalEventListenerFactory
org.springframework.context.event.internalEventListenerProcessor
parameterNamesModule
pathMappedEndpoints
preserveErrorControllerTargetClassPostProcessor
processorMetrics
propertiesMeterFilter
propertySourcesPlaceholderConfigurer
requestContextFilter
requestMappingHandlerAdapter
requestMappingHandlerMapping
resourceHandlerMapping
restTemplateBuilder
restTemplateTagConfigurer
scheduledTasksEndpoint
server-org.springframework.boot.autoconfigure.web.ServerProperties
servletEndpointDiscoverer
servletEndpointRegistrar
servletExposeExcludePropertyEndpointFilter
servletMappingDescriptionProvider
servletWebChildContextFactory
servletWebServerFactoryCustomizer
simpleConfig
simpleControllerHandlerAdapter
simpleMeterRegistry
spring.http-org.springframework.boot.autoconfigure.http.HttpProperties
spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties
spring.jackson-org.springframework.boot.autoconfigure.jackson.JacksonProperties
spring.mvc-org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties
spring.resources-org.springframework.boot.autoconfigure.web.ResourceProperties
spring.servlet.multipart-org.springframework.boot.autoconfigure.web.servlet.MultipartProperties
spring.task.execution-org.springframework.boot.autoconfigure.task.TaskExecutionProperties
spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties
springApplicationAdminRegistrar
standardJacksonObjectMapperBuilderCustomizer
stringHttpMessageConverter
taskExecutorBuilder
taskSchedulerBuilder
tomcatMetricsBinder
tomcatServletWebServerFactory
tomcatServletWebServerFactoryCustomizer
tomcatWebServerFactoryCustomizer
traceRepository
uptimeMetrics
viewControllerHandlerMapping
viewResolver
webEndpointDiscoverer
webEndpointPathMapper
webEndpointServletHandlerMapping
webExposeExcludePropertyEndpointFilter
webMvcMetricsFilter
webMvcTagsProvider
webServerFactoryCustomizerBeanPostProcessor
websocketServletWebServerCustomizer
welcomePageHandlerMapping
2019-05-27 15:20:56.456  INFO 79829 --- [)-192.168.0.106] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2019-05-27 15:20:56.456  INFO 79829 --- [)-192.168.0.106] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2019-05-27 15:20:56.637  INFO 79829 --- [)-192.168.0.106] o.s.web.servlet.DispatcherServlet        : Completed initialization in 181 ms

 */