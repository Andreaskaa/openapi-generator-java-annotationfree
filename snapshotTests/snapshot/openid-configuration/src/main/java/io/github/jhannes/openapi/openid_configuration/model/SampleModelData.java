/*
 * Open ID Connect
 * Open ID Connect Discovery
 *
 * The version of the OpenAPI document: 1.0.0-draft
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.openid_configuration.model;


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
 * Model tests for Open ID Connect
 */
public class SampleModelData {

    public SampleModelData(Random random) {
        this.random = random;
    }

    public SampleModelData(long seed) {
        this(new Random(seed));
    }

    public DiscoveryDocumentDto sampleDiscoveryDocumentDto(String propertyName) {
        return sampleDiscoveryDocumentDto();
    }

    public DiscoveryDocumentDto sampleDiscoveryDocumentDto() {
        return new DiscoveryDocumentDto()
            .issuer(randomString("issuer"))
            .authorizationEndpoint(randomString("authorizationEndpoint", "url"))
            .tokenEndpoint(randomString("tokenEndpoint", "url"))
            .endSessionEndpoint(randomString("endSessionEndpoint", "url"))
            .jwksUri(randomString("jwksUri", "url"))
            .responseTypesSupported(sampleList(() -> sampleDiscoveryDocumentDtoResponseTypesSupportedEnum("responseTypesSupported"), "responseTypesSupported"))
            .responseModesSupported(sampleList(() -> sampleDiscoveryDocumentDtoResponseModesSupportedEnum("responseModesSupported"), "responseModesSupported"))
            .subjectTypesSupported(sampleList(() -> sampleDiscoveryDocumentDtoSubjectTypesSupportedEnum("subjectTypesSupported"), "subjectTypesSupported"))
            .codeChallengeMethodsSupported(sampleList(() -> sampleDiscoveryDocumentDtoCodeChallengeMethodsSupportedEnum("codeChallengeMethodsSupported"), "codeChallengeMethodsSupported"))
            .idTokenSigningAlgValuesSupported(sampleList(() -> sampleDiscoveryDocumentDtoIdTokenSigningAlgValuesSupportedEnum("idTokenSigningAlgValuesSupported"), "idTokenSigningAlgValuesSupported"))
            .xSsoFrame(randomString("xSsoFrame", "url"));
    }

    public List<DiscoveryDocumentDto> sampleListOfDiscoveryDocumentDto(String propertyName) {
        return sampleListOfDiscoveryDocumentDto();
    }

    public List<DiscoveryDocumentDto> sampleListOfDiscoveryDocumentDto() {
        return sampleList(() -> sampleDiscoveryDocumentDto());
    }

    public DiscoveryDocumentDto.ResponseTypesSupportedEnum sampleDiscoveryDocumentDtoResponseTypesSupportedEnum(String propertyName) {
        return pickOne(DiscoveryDocumentDto.ResponseTypesSupportedEnum.values());
    }

    public DiscoveryDocumentDto.ResponseModesSupportedEnum sampleDiscoveryDocumentDtoResponseModesSupportedEnum(String propertyName) {
        return pickOne(DiscoveryDocumentDto.ResponseModesSupportedEnum.values());
    }

    public DiscoveryDocumentDto.SubjectTypesSupportedEnum sampleDiscoveryDocumentDtoSubjectTypesSupportedEnum(String propertyName) {
        return pickOne(DiscoveryDocumentDto.SubjectTypesSupportedEnum.values());
    }

    public DiscoveryDocumentDto.CodeChallengeMethodsSupportedEnum sampleDiscoveryDocumentDtoCodeChallengeMethodsSupportedEnum(String propertyName) {
        return pickOne(DiscoveryDocumentDto.CodeChallengeMethodsSupportedEnum.values());
    }

    public DiscoveryDocumentDto.IdTokenSigningAlgValuesSupportedEnum sampleDiscoveryDocumentDtoIdTokenSigningAlgValuesSupportedEnum(String propertyName) {
        return pickOne(DiscoveryDocumentDto.IdTokenSigningAlgValuesSupportedEnum.values());
    }

    public JwksDocumentDto sampleJwksDocumentDto(String propertyName) {
        return sampleJwksDocumentDto();
    }

    public JwksDocumentDto sampleJwksDocumentDto() {
        return new JwksDocumentDto()
            .keys(sampleListOfJwksKeyDto("keys"));
    }

    public List<JwksDocumentDto> sampleListOfJwksDocumentDto(String propertyName) {
        return sampleListOfJwksDocumentDto();
    }

    public List<JwksDocumentDto> sampleListOfJwksDocumentDto() {
        return sampleList(() -> sampleJwksDocumentDto());
    }

    public JwksKeyDto sampleJwksKeyDto(String propertyName) {
        return sampleJwksKeyDto();
    }

    public JwksKeyDto sampleJwksKeyDto() {
        return new JwksKeyDto()
            .kty(randomString("kty"))
            .use(randomString("use"))
            .kid(randomString("kid"))
            .x5c(randomString("x5c"));
    }

    public List<JwksKeyDto> sampleListOfJwksKeyDto(String propertyName) {
        return sampleListOfJwksKeyDto();
    }

    public List<JwksKeyDto> sampleListOfJwksKeyDto() {
        return sampleList(() -> sampleJwksKeyDto());
    }

    public JwtHeaderDto sampleJwtHeaderDto(String propertyName) {
        return sampleJwtHeaderDto();
    }

    public JwtHeaderDto sampleJwtHeaderDto() {
        return new JwtHeaderDto()
            .typ(randomString("typ"))
            .kid(randomString("kid"))
            .alg(randomString("alg"));
    }

    public List<JwtHeaderDto> sampleListOfJwtHeaderDto(String propertyName) {
        return sampleListOfJwtHeaderDto();
    }

    public List<JwtHeaderDto> sampleListOfJwtHeaderDto() {
        return sampleList(() -> sampleJwtHeaderDto());
    }

    public JwtPayloadDto sampleJwtPayloadDto(String propertyName) {
        return sampleJwtPayloadDto();
    }

    public JwtPayloadDto sampleJwtPayloadDto() {
        return new JwtPayloadDto()
            .iss(randomString("iss", "url"))
            .sub(randomString("sub"))
            .aud(randomString("aud"))
            .name(randomString("name"))
            .email(randomString("email"))
            .orgId(randomString("orgId"))
            .org(randomString("org"))
            .pid(randomString("pid"));
    }

    public List<JwtPayloadDto> sampleListOfJwtPayloadDto(String propertyName) {
        return sampleListOfJwtPayloadDto();
    }

    public List<JwtPayloadDto> sampleListOfJwtPayloadDto() {
        return sampleList(() -> sampleJwtPayloadDto());
    }

    public TokenResponseDto sampleTokenResponseDto(String propertyName) {
        return sampleTokenResponseDto();
    }

    public TokenResponseDto sampleTokenResponseDto() {
        return new TokenResponseDto()
            .accessToken(randomString("accessToken"))
            .tokenType(randomString("tokenType"))
            .expiresIn(randomInteger("expiresIn"))
            .scope(randomString("scope"))
            .idToken(randomString("idToken"))
            .refreshToken(randomString("refreshToken"));
    }

    public List<TokenResponseDto> sampleListOfTokenResponseDto(String propertyName) {
        return sampleListOfTokenResponseDto();
    }

    public List<TokenResponseDto> sampleListOfTokenResponseDto() {
        return sampleList(() -> sampleTokenResponseDto());
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
