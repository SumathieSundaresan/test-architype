package ${package}.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/version", produces = APPLICATION_JSON_UTF8_VALUE)
public class VersionController {

    private static final String BUILD_VERSION = "version";
    private static final String BUILD_TIMESTAMP = "date";

    private final Map<String, String> buildInfo;

    public VersionController(String buildVersion, String buildTimestamp) {
        buildInfo = new HashMap<>();
        buildInfo.put(BUILD_VERSION, buildVersion);
        buildInfo.put(BUILD_TIMESTAMP, buildTimestamp);
    }

    @RequestMapping(method = GET)
    public Map<String, String> version() {
        return buildInfo;
    }
}
