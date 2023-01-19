package ru.krsmon.zhelper;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ActiveProfiles(profiles = "test")
@SpringBootTest(classes = ZabbixHelperApplication.class)
@TestPropertySource(locations = "/application-test.yaml")
@ExtendWith({ SpringExtension.class, OutputCaptureExtension.class })
public abstract class ZabbixHelperAbstractTest extends MockData {
}
