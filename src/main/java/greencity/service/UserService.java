package greencity.service;

import greencity.dto.user.UserPageableDto;
import greencity.entity.User;
import greencity.entity.enums.ROLE;
import greencity.entity.enums.UserStatus;
import org.springframework.data.domain.Pageable;

/**
 * Provides the interface to manage {@link User} entity.
 *
 * @author Nazar Stasyuk and Rostyslav .....
 * @version 1.0
 */
public interface UserService {

    /**
     * Method that allow you to save new {@link User}
     *
     * @param user a value of {@link User}
     */
    User save(User user);

    User update(User user);

    /**
     * Method that allow you to find {@link User} by ID
     *
     * @param id a value of {@link Long}
     * @return {@link User}
     */
    User findById(Long id);

    /**
     * Method that allow you to delete {@link User} by ID
     *
     * @param id a value of {@link Long}
     */
    void deleteById(Long id);

    /**
     * Method that allow you to find {@link User} by email
     *
     * @param email a value of {@link String}
     * @return {@link User}
     */
    User findByEmail(String email);

    /**
     * Update {@code ROLE} of user.
     *
     * @param id {@code User} id.
     * @param role {@code ROLE} for user.
     * @author Rostyslav Khasanov
     */
    void updateRole(Long id, ROLE role);

    /**
     * Update {@code UserStatus} of user.
     *
     * @param id {@code User} id.
     * @param userStatus {@code UserStatus} for user.
     * @author Rostyslav Khasanov
     */
    void updateUserStatus(Long id, UserStatus userStatus);

    /**
     * Find by page {@code User}.
     *
     * @param pageable a value with pageable configuration.
     * @return a dto of {@code PageableDto<UserForDtoList>}.
     * @author Rostyslav Khasanov
     */
    UserPageableDto findByPage(Pageable pageable);
}