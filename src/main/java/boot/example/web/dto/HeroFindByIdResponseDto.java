package boot.example.web.dto;

import boot.example.web.domain.hero.Hero;
import lombok.Getter;

@Getter
public class HeroFindByIdResponseDto {

    private Long id;
    private String name;
    private int age;
    private String note;

    public HeroFindByIdResponseDto(Hero entity) {
        id = entity.getId();
        name = entity.getName();
        age = entity.getAge();
        note = entity.getNote();
    }
}
