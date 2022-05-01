/*
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key \"special-key\" to test the authorization filters
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.petstore.model;


import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

import java.util.function.Supplier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

/**
 * Model tests for OpenAPI Petstore
 */
public class SampleModelData {

    protected final Random random;

    public SampleModelData(long seed) {
        this.random = new Random(seed);
    }

    public CategoryDto sampleCategoryDto(String propertyName) {

        return new CategoryDto()



            .id(randomLong("id"))







            .name(randomString("name"))


            ;

    }

    public List<CategoryDto> sampleListOfCategoryDto(String propertyName) {
        return sampleList(() -> sampleCategoryDto(propertyName), propertyName);
    }



    public OrderDto sampleOrderDto(String propertyName) {

        return new OrderDto()



            .id(randomLong("id"))






            .petId(randomLong("petId"))






            .quantity(randomInteger("quantity"))





            .shipDate(sampleOffsetDateTime("shipDate"))






            .status(sampleOrderDtoStatusEnum("status"))






            .complete(randomBoolean("complete"))



            ;

    }

    public List<OrderDto> sampleListOfOrderDto(String propertyName) {
        return sampleList(() -> sampleOrderDto(propertyName), propertyName);
    }

    public OrderDto.StatusEnum sampleOrderDtoStatusEnum(String propertyName) {
        return pickOne(new OrderDto.StatusEnum[] {

            OrderDto.StatusEnum.PLACED,

            OrderDto.StatusEnum.APPROVED,

            OrderDto.StatusEnum.DELIVERED,

        });
    }



    public PetDto samplePetDto(String propertyName) {

        return new PetDto()



            .id(randomLong("id"))





            .category(sampleCategoryDto("category"))








            .name(randomString("name"))




            .photoUrls(sampleList(() -> randomString("photoUrls"), "photoUrls"))



            .tags(sampleListOfTagDto("tags"))





            .status(samplePetDtoStatusEnum("status"))



            ;

    }

    public List<PetDto> sampleListOfPetDto(String propertyName) {
        return sampleList(() -> samplePetDto(propertyName), propertyName);
    }

    public PetDto.StatusEnum samplePetDtoStatusEnum(String propertyName) {
        return pickOne(new PetDto.StatusEnum[] {

            PetDto.StatusEnum.AVAILABLE,

            PetDto.StatusEnum.PENDING,

            PetDto.StatusEnum.SOLD,

        });
    }



    public TagDto sampleTagDto(String propertyName) {

        return new TagDto()



            .id(randomLong("id"))







            .name(randomString("name"))


            ;

    }

    public List<TagDto> sampleListOfTagDto(String propertyName) {
        return sampleList(() -> sampleTagDto(propertyName), propertyName);
    }



    public UserDto sampleUserDto(String propertyName) {

        return new UserDto()



            .id(randomLong("id"))







            .username(randomString("username"))






            .firstName(randomString("firstName"))






            .lastName(randomString("lastName"))






            .email(randomString("email"))






            .password(randomString("password"))






            .phone(randomString("phone"))





            .userStatus(randomInteger("userStatus"))



            ;

    }

    public List<UserDto> sampleListOfUserDto(String propertyName) {
        return sampleList(() -> sampleUserDto(propertyName), propertyName);
    }




    public <T> List<T> sampleList(Supplier<T> supplier, String propertyName) {
        return sampleList(supplier, propertyName, 1, 1);
    }

    public <T> List<T> sampleList(Supplier<T> supplier, String propertyName, int min, int max) {
        return List.of(supplier.get());
    }

    public String randomString(String propertyName, String dataFormat) {
        return "str" + randomUUID(propertyName, dataFormat);
    }

    public String randomString(String propertyName) {
        return randomString(propertyName, null);
    }

    public UUID randomUUID(String propertyName, String dataFormat) {
        byte[] bytes = new byte[16];
        random.nextBytes(bytes);
        return UUID.nameUUIDFromBytes(bytes);
    }

    public URI randomURI(String propertyName, String dataFormat) {
        return asURI("https://" +
            pickOne(List.of("a", "b", "c")) +
            ".example." +
            pickOne(List.of("com", "net", "io"))
        );
    }

    public Long randomLong(String propertyName) {
        return random.nextLong(10000L);
    }

    public Integer randomInteger(String propertyName) {
        return random.nextInt(10000);
    }

    public Double randomDouble(String propertyName) {
        return random.nextDouble(10000.0);
    }

    public Boolean randomBoolean(String propertyName) {
        return random.nextBoolean();
    }

    public LocalDate sampleLocalDate(String propertyName) {
        return LocalDate.of(2022, 1, 1).plusDays(random.nextInt(1000));
    }

    public LocalTime sampleLocalTime(String propertyName) {
        return LocalTime.of(0, 0).plusMinutes(random.nextInt(24*60));
    }

    public LocalDateTime sampleLocalDateTime(String propertyName) {
        return LocalDateTime.of(
            sampleLocalDate(propertyName), sampleLocalTime(propertyName)
        );
    }

    public ZoneId sampleZoneId(String propertyName) {
        return ZoneId.of(pickOne(ZoneId.getAvailableZoneIds()));
    }

    public ZonedDateTime sampleZonedDateTime(String propertyName) {
        return ZonedDateTime.of(
            sampleLocalDateTime(propertyName), sampleZoneId(propertyName)
        );
    }

    public OffsetDateTime sampleOffsetDateTime(String propertyName) {
        return sampleZonedDateTime(propertyName).toOffsetDateTime();
    }

    public <T> T pickOne(T[] alternatives) {
        return alternatives[random.nextInt(alternatives.length)];
    }

    public <T> T pickOne(List<T> alternatives) {
        return alternatives.get(random.nextInt(alternatives.size()));
    }

    public <T> T pickOne(Set<T> alternatives) {
        return pickOne(new ArrayList<>(alternatives));
    }

    public static URI asURI(String uri) {
        try {
            return new URI(uri);
        } catch (java.net.URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
