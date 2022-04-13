package com.lock.lockassistant

import net.pwall.json.schema.codegen.CodeGenerator
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.io.File

@Component
class CodeGen: CommandLineRunner {

    var logger: Logger = LoggerFactory.getLogger(CodeGen::class.java)

    override fun run(vararg args: String?) {
        val generator = CodeGenerator()
        generator.baseDirectoryName = "src/main/kotlin"
//        generator.basePackageName = "com.lock.lockassistant.model.intents"
//        generator.generate(File("src/main/resources/smart-home-schema-master/intents"))
//        generator.basePackageName = "com.lock.lockassistant.model.platform"
//        generator.generate(File("src/main/resources/smart-home-schema-master/platform"))
//        generator.basePackageName = "com.lock.lockassistant.model.traits"
//        generator.generate(File("src/main/resources/smart-home-schema-master/traits"))
        generator.basePackageName = "com.lock.lockassistant.model.types"
        generator.generate(File("src/main/resources/smart-home-schema-master/types/door"))
        logger.info("Done")
    }
}
