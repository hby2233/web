package boot.example.web.domain.hero;

import boot.example.web.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Hero extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private  String name;

    private int age;

    private String note;

    @Builder
    public Hero(long id, String name, int age, String note) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.note = note;
    }
}
