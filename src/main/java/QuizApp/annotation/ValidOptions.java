package QuizApp.annotation;

import QuizApp.validator.OptionsKeysValidator;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = OptionsKeysValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidOptions {

    String message() default "Each option must be uniquely labeled with 'A', 'B', 'C', or 'D' and must not be empty, having 1 to 30 characters.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}


