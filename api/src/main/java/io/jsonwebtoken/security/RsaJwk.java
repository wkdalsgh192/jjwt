package io.jsonwebtoken.security;

/**
 * @since JJWT_RELEASE_VERSION
 */
public interface RsaJwk<T extends RsaJwk<T>> extends Jwk<T>, RsaJwkMutator<T> {

    String getModulus();

    String getExponent();
}