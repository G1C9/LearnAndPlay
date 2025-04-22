package com.example.learnandplay.controller.game;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/game")
@Tag(name = "Контроллер для проверки ответов", description = "Контроллер для проверки ответов по каждой игоровой сессии")
public interface SubmitAnswersController {

    @PostMapping("/firstGame/answers/{sessionId}")
    Boolean submitFirstAnswers(@PathVariable UUID sessionId, @RequestBody Map<String, String> pairs);

    @PostMapping("/secondGame/answers/{sessionId}")
    Boolean submitSecondAnswers(@PathVariable UUID sessionId, @RequestBody String selectedOption);

    @PostMapping("/thirdGame/answers/{sessionId}")
    Boolean submitThirdAnswers(@PathVariable UUID sessionId, @RequestBody List<String> userOrder);

    @PostMapping("/fourthGame/answers/{sessionId}")
    Boolean submitFourthAnswers(@PathVariable UUID sessionId, @RequestBody String userInput);

}
