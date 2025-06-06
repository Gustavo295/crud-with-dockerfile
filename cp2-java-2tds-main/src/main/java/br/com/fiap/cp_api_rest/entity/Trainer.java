package br.com.fiap.cp_api_rest.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
@Table(name="trainer_pokemon")
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "trainer_name", nullable = false)
    private String name;
    @Column(name = "date_start")
    private Date startJourney;
    @Column(name = "money",nullable = false)
    private double money = 0;
    @Column(name = "pokemon_caught",nullable = false)
    private int pokemonHasCaught = 0;
    @Column(name = "pokemon_view",nullable = false)
    private int pokemonHasView = 0;
    @Column(name = "number_badge",nullable = false)
    private int numberBadge = 0;
    @Column(name = "city",nullable = false)
    private String city;

    @OneToMany(mappedBy = "trainer")
    private List<PokemonTrainer> pokemons;
    //TODO: ADIONAR HISTORICO DE VITÓRIAS E DERROTAS QUANDO HOUVER A CLASSE BATTLE


    public Trainer() {
    }

    public Trainer(Long id, String name, Date startJourney, double money, int pokemonHasCaught, int pokemonHasView, int numberBadge, String city, List<PokemonTrainer> pokemons) {
        this.id = id;
        this.name = name;
        this.startJourney = startJourney;
        this.money = money;
        this.pokemonHasCaught = pokemonHasCaught;
        this.pokemonHasView = pokemonHasView;
        this.numberBadge = numberBadge;
        this.city = city;
        this.pokemons = pokemons;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartJourney() {
        return startJourney;
    }

    public void setStartJourney(Date startJourney) {
        this.startJourney = startJourney;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;

    }

    public int getPokemonHasCaught() {
        return pokemonHasCaught;
    }

    public void setPokemonHasCaught(int pokemonHasCaught) {
        this.pokemonHasCaught = pokemonHasCaught;
    }

    public int getPokemonHasView() {
        return pokemonHasView;
    }

    public void setPokemonHasView(int pokemonHasView) {
        this.pokemonHasView = pokemonHasView;
    }

    public int getNumberBadge() {
        return numberBadge;
    }

    public void setNumberBadge(int numberBadge) {
        this.numberBadge = numberBadge;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<PokemonTrainer> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<PokemonTrainer> pokemons) {
        this.pokemons = pokemons;
    }
}
