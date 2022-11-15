/*
 * Poly API
 * An example of a polymorphic API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: johannes@brodwall.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.poly.model;


import java.net.URI;
import java.time.Instant;
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
 * Model tests for Poly API
 */
public class SampleModelData {

    public SampleModelData(Random random) {
        this.random = random;
    }

    public SampleModelData(long seed) {
        this(new Random(seed));
    }

    public AnyPartyDto sampleAnyPartyDto(String propertyName) {
        return sampleAnyPartyDto();
    }

    public AnyPartyDto sampleAnyPartyDto() {
        List<Supplier<AnyPartyDto>> factories = List.of(
            () -> sampleOrganizationDto().type("organization"),
            () -> samplePersonDto().type("person")
        );
        return pickOne(factories).get();
    }

    public List<AnyPartyDto> sampleListOfAnyPartyDto(String propertyName) {
        return sampleListOfAnyPartyDto();
    }

    public List<AnyPartyDto> sampleListOfAnyPartyDto() {
        return sampleList(() -> sampleAnyPartyDto());
    }

    public CreationErrorDto sampleCreationErrorDto(String propertyName) {
        return sampleCreationErrorDto();
    }

    public CreationErrorDto sampleCreationErrorDto() {
        List<Supplier<CreationErrorDto>> factories = List.of(
            () -> sampleDuplicateIdentifierErrorDto().code("duplicateIdentifier"),
            () -> sampleGeneralErrorDto().code("generalError"),
            () -> sampleIllegalEmailAddressErrorDto().code("illegalAddress"),
            () -> sampleGeneralErrorDto().code("networkError")
        );
        return pickOne(factories).get();
    }

    public List<CreationErrorDto> sampleListOfCreationErrorDto(String propertyName) {
        return sampleListOfCreationErrorDto();
    }

    public List<CreationErrorDto> sampleListOfCreationErrorDto() {
        return sampleList(() -> sampleCreationErrorDto());
    }

    public DuplicateIdentifierErrorDto sampleDuplicateIdentifierErrorDto(String propertyName) {
        return sampleDuplicateIdentifierErrorDto();
    }

    public DuplicateIdentifierErrorDto sampleDuplicateIdentifierErrorDto() {
        return new DuplicateIdentifierErrorDto()
            .code(randomString("code"))
            .identifierValue(randomString("identifierValue"))
            .entityType(randomString("entityType"));
    }

    public List<DuplicateIdentifierErrorDto> sampleListOfDuplicateIdentifierErrorDto(String propertyName) {
        return sampleListOfDuplicateIdentifierErrorDto();
    }

    public List<DuplicateIdentifierErrorDto> sampleListOfDuplicateIdentifierErrorDto() {
        return sampleList(() -> sampleDuplicateIdentifierErrorDto());
    }

    public GeneralErrorDto sampleGeneralErrorDto(String propertyName) {
        return sampleGeneralErrorDto();
    }

    public GeneralErrorDto sampleGeneralErrorDto() {
        return new GeneralErrorDto()
            .code(randomString("code"))
            .description(randomString("description"));
    }

    public List<GeneralErrorDto> sampleListOfGeneralErrorDto(String propertyName) {
        return sampleListOfGeneralErrorDto();
    }

    public List<GeneralErrorDto> sampleListOfGeneralErrorDto() {
        return sampleList(() -> sampleGeneralErrorDto());
    }

    public IllegalEmailAddressErrorDto sampleIllegalEmailAddressErrorDto(String propertyName) {
        return sampleIllegalEmailAddressErrorDto();
    }

    public IllegalEmailAddressErrorDto sampleIllegalEmailAddressErrorDto() {
        return new IllegalEmailAddressErrorDto()
            .code(randomString("code"))
            .inputEmailAddress(randomString("inputEmailAddress"))
            .validDomains(sampleList(() -> randomString("validDomains"), "validDomains"));
    }

    public List<IllegalEmailAddressErrorDto> sampleListOfIllegalEmailAddressErrorDto(String propertyName) {
        return sampleListOfIllegalEmailAddressErrorDto();
    }

    public List<IllegalEmailAddressErrorDto> sampleListOfIllegalEmailAddressErrorDto() {
        return sampleList(() -> sampleIllegalEmailAddressErrorDto());
    }

    public LogMessageDto sampleLogMessageDto(String propertyName) {
        return sampleLogMessageDto();
    }

    public LogMessageDto sampleLogMessageDto() {
        return new LogMessageDto()
            .message(randomString("message"))
            .error(randomObject("error"));
    }

    public List<LogMessageDto> sampleListOfLogMessageDto(String propertyName) {
        return sampleListOfLogMessageDto();
    }

    public List<LogMessageDto> sampleListOfLogMessageDto() {
        return sampleList(() -> sampleLogMessageDto());
    }

    public NotFoundErrorDto sampleNotFoundErrorDto(String propertyName) {
        return sampleNotFoundErrorDto();
    }

    public NotFoundErrorDto sampleNotFoundErrorDto() {
        return new NotFoundErrorDto()
            .code(randomString("code"))
            .identifierValue(randomString("identifierValue"))
            .entityType(randomString("entityType"));
    }

    public List<NotFoundErrorDto> sampleListOfNotFoundErrorDto(String propertyName) {
        return sampleListOfNotFoundErrorDto();
    }

    public List<NotFoundErrorDto> sampleListOfNotFoundErrorDto() {
        return sampleList(() -> sampleNotFoundErrorDto());
    }

    public OrganizationDto sampleOrganizationDto(String propertyName) {
        return sampleOrganizationDto();
    }

    public OrganizationDto sampleOrganizationDto() {
        return new OrganizationDto()
            .id(randomUUID("id"))
            .type(randomString("type"))
            .name(randomString("name"))
            .organizationId(randomString("organizationId"))
            .url(randomURI("url"))
            .email(randomString("email", "email"))
            .emailDomains(sampleList(() -> randomString("emailDomains"), "emailDomains"))
            .phone(randomString("phone", "phone"));
    }

    public List<OrganizationDto> sampleListOfOrganizationDto(String propertyName) {
        return sampleListOfOrganizationDto();
    }

    public List<OrganizationDto> sampleListOfOrganizationDto() {
        return sampleList(() -> sampleOrganizationDto());
    }

    public PersonDto samplePersonDto(String propertyName) {
        return samplePersonDto();
    }

    public PersonDto samplePersonDto() {
        return new PersonDto()
            .id(randomUUID("id"))
            .type(randomString("type"))
            .givenName(randomString("givenName"))
            .familyName(randomString("familyName"))
            .email(randomString("email", "email"))
            .phone(randomString("phone", "phone"))
            .birthDate(sampleLocalDate("birthDate"));
    }

    public List<PersonDto> sampleListOfPersonDto(String propertyName) {
        return sampleListOfPersonDto();
    }

    public List<PersonDto> sampleListOfPersonDto() {
        return sampleList(() -> samplePersonDto());
    }

    public UpdateErrorDto sampleUpdateErrorDto(String propertyName) {
        return sampleUpdateErrorDto();
    }

    public UpdateErrorDto sampleUpdateErrorDto() {
        List<Supplier<UpdateErrorDto>> factories = List.of(
            () -> sampleDuplicateIdentifierErrorDto().code("duplicateIdentifier"),
            () -> sampleGeneralErrorDto().code("generalError"),
            () -> sampleIllegalEmailAddressErrorDto().code("illegalAddress"),
            () -> sampleGeneralErrorDto().code("networkError"),
            () -> sampleNotFoundErrorDto().code("notFound")
        );
        return pickOne(factories).get();
    }

    public List<UpdateErrorDto> sampleListOfUpdateErrorDto(String propertyName) {
        return sampleListOfUpdateErrorDto();
    }

    public List<UpdateErrorDto> sampleListOfUpdateErrorDto() {
        return sampleList(() -> sampleUpdateErrorDto());
    }

    protected final Random random;
    protected final Map<String, Supplier<String>> dataFormatFactories = new HashMap<>(Map.of(
        "email", this::randomEmail,
        "phone", this::randomPhoneNumber
    ));
    protected final Map<String, Supplier<String>> propertyNameFactories = new HashMap<>(Map.of(
        "givenName", this::randomGivenName,
        "familyName", this::randomFamilyName,
        "personName", this::randomPersonName
    ));

    public <T> List<T> sampleList(Supplier<T> supplier, String propertyName) {
        return sampleList(supplier, propertyName, 1, 4);
    }

    public <T> List<T> sampleList(Supplier<T> supplier) {
        return sampleList(supplier, 1, 4);
    }

    public <T> List<T> sampleList(Supplier<T> supplier, String propertyName, int min, int max) {
        return sampleList(supplier, min, max);
    }

    public <T> List<T> sampleList(Supplier<T> supplier, int min, int max) {
        List<T> result = new ArrayList<>();
        int count = min + random.nextInt(max - min);
        for (int i=0; i<count; i++) {
            result.add(supplier.get());
        }
        return result;
    }

    public <T> Map<String, T> sampleMap(Supplier<T> supplier, String propertyName) {
        return sampleMap(supplier, propertyName, 1, 4);
    }

    public <T> Map<String, T> sampleMap(Supplier<T> supplier, String propertyName, int min, int max) {
        Map<String, T> result = new HashMap<>();
        int count = min + random.nextInt(max - min);
        for (int i=0; i<count; i++) {
            result.put(randomString(propertyName), supplier.get());
        }
        return result;
    }

    public String randomString(String propertyName, String dataFormat) {
        if (dataFormatFactories.containsKey(dataFormat)) {
            return dataFormatFactories.get(dataFormat).get();
        }
        if (propertyNameFactories.containsKey(propertyName)) {
            return propertyNameFactories.get(propertyName).get();
        }
        return "str" + randomUUID(propertyName);
    }

    public String randomString(String propertyName) {
        return randomString(propertyName, null);
    }

    public UUID randomUUID(String propertyName) {
        byte[] bytes = new byte[16];
        random.nextBytes(bytes);
        return UUID.nameUUIDFromBytes(bytes);
    }

    public Long randomLong(String propertyName) {
        return random.nextLong() % 10000L;
    }

    public Integer randomInteger(String propertyName) {
        return random.nextInt(10000);
    }

    public Double randomDouble(String propertyName) {
        return random.nextDouble() * 10000.0;
    }

    public Boolean randomBoolean(String propertyName) {
        return random.nextBoolean();
    }

    public Object randomObject(String propertyName) {
        Map<String, String> result = new HashMap<>();
        result.put(randomString(propertyName + ".key"), randomString(propertyName + ".value"));
        return result;
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

    public Instant sampleInstant(String propertyName) {
        return sampleZonedDateTime(propertyName).toInstant();
    }

    public URI randomURI(String propertyName) {
        return asURI("https://" + randomDomainName());
    }

    public String randomDomainName() {
        return pickOne(List.of("a", "b", "c")) +
            ".example." +
            pickOne(List.of("com", "net", "io"));
    }

    public String randomEmail() {
        return (
            randomGivenName().toLowerCase() +
            "." +
            randomFamilyName().toLowerCase() +
            "@" +
            randomDomainName()
        );
    }

    public String randomPersonName() {
        return randomGivenName() + " " + randomFamilyName();
    }

    public String randomGivenName() {
        return pickOne(List.of("James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Linda"));
    }

    public String randomFamilyName() {
        return pickOne(List.of("Smith", "Williams", "Johnson", "Jones", "Brown", "Davis", "Wilson"));
    }

    public String randomPhoneNumber() {
        return "636-555-" + (1000 + random.nextInt(9000));
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
