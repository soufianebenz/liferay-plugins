/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow.kaleo.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the kaleo timer instance token local service. This utility wraps {@link com.liferay.portal.workflow.kaleo.service.impl.KaleoTimerInstanceTokenLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoTimerInstanceTokenLocalService
 * @see com.liferay.portal.workflow.kaleo.service.base.KaleoTimerInstanceTokenLocalServiceBaseImpl
 * @see com.liferay.portal.workflow.kaleo.service.impl.KaleoTimerInstanceTokenLocalServiceImpl
 * @generated
 */
public class KaleoTimerInstanceTokenLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.portal.workflow.kaleo.service.impl.KaleoTimerInstanceTokenLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the kaleo timer instance token to the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTimerInstanceToken the kaleo timer instance token to add
	* @return the kaleo timer instance token that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken addKaleoTimerInstanceToken(
		com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken kaleoTimerInstanceToken)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addKaleoTimerInstanceToken(kaleoTimerInstanceToken);
	}

	/**
	* Creates a new kaleo timer instance token with the primary key. Does not add the kaleo timer instance token to the database.
	*
	* @param kaleoTimerInstanceTokenId the primary key for the new kaleo timer instance token
	* @return the new kaleo timer instance token
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken createKaleoTimerInstanceToken(
		long kaleoTimerInstanceTokenId) {
		return getService()
				   .createKaleoTimerInstanceToken(kaleoTimerInstanceTokenId);
	}

	/**
	* Deletes the kaleo timer instance token with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTimerInstanceTokenId the primary key of the kaleo timer instance token to delete
	* @throws PortalException if a kaleo timer instance token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteKaleoTimerInstanceToken(
		long kaleoTimerInstanceTokenId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteKaleoTimerInstanceToken(kaleoTimerInstanceTokenId);
	}

	/**
	* Deletes the kaleo timer instance token from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTimerInstanceToken the kaleo timer instance token to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteKaleoTimerInstanceToken(
		com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken kaleoTimerInstanceToken)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteKaleoTimerInstanceToken(kaleoTimerInstanceToken);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the kaleo timer instance token with the primary key.
	*
	* @param kaleoTimerInstanceTokenId the primary key of the kaleo timer instance token to get
	* @return the kaleo timer instance token
	* @throws PortalException if a kaleo timer instance token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken getKaleoTimerInstanceToken(
		long kaleoTimerInstanceTokenId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getKaleoTimerInstanceToken(kaleoTimerInstanceTokenId);
	}

	/**
	* Gets a range of all the kaleo timer instance tokens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of kaleo timer instance tokens to return
	* @param end the upper bound of the range of kaleo timer instance tokens to return (not inclusive)
	* @return the range of kaleo timer instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken> getKaleoTimerInstanceTokens(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKaleoTimerInstanceTokens(start, end);
	}

	/**
	* Gets the number of kaleo timer instance tokens.
	*
	* @return the number of kaleo timer instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public static int getKaleoTimerInstanceTokensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKaleoTimerInstanceTokensCount();
	}

	/**
	* Updates the kaleo timer instance token in the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTimerInstanceToken the kaleo timer instance token to update
	* @return the kaleo timer instance token that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken updateKaleoTimerInstanceToken(
		com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken kaleoTimerInstanceToken)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateKaleoTimerInstanceToken(kaleoTimerInstanceToken);
	}

	/**
	* Updates the kaleo timer instance token in the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTimerInstanceToken the kaleo timer instance token to update
	* @param merge whether to merge the kaleo timer instance token with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the kaleo timer instance token that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken updateKaleoTimerInstanceToken(
		com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken kaleoTimerInstanceToken,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateKaleoTimerInstanceToken(kaleoTimerInstanceToken, merge);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken addKaleoTimerInstanceToken(
		long kaleoInstanceTokenId, long kaleoTimerId,
		java.lang.String kaleoTimerName,
		java.util.Map<java.lang.String, java.io.Serializable> workflowContext,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addKaleoTimerInstanceToken(kaleoInstanceTokenId,
			kaleoTimerId, kaleoTimerName, workflowContext, serviceContext);
	}

	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken> addKaleoTimerInstanceTokens(
		com.liferay.portal.workflow.kaleo.model.KaleoInstanceToken kaleoInstanceToken,
		java.util.Collection<com.liferay.portal.workflow.kaleo.model.KaleoTimer> kaleoTimers,
		java.util.Map<java.lang.String, java.io.Serializable> workflowContext,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addKaleoTimerInstanceTokens(kaleoInstanceToken,
			kaleoTimers, workflowContext, serviceContext);
	}

	public static void completeKaleoTimerInstanceTokens(long kaleoInstanceId,
		java.util.Collection<com.liferay.portal.workflow.kaleo.model.KaleoTimer> kaleoTimers,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.completeKaleoTimerInstanceTokens(kaleoInstanceId, kaleoTimers,
			serviceContext);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken completeKaleoTimerInstanceToken(
		long kaleoTimerInstanceTokenId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .completeKaleoTimerInstanceToken(kaleoTimerInstanceTokenId,
			serviceContext);
	}

	public static void deleteKaleoTimerInstanceToken(long kaleoInstanceId,
		long kaleoTimerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteKaleoTimerInstanceToken(kaleoInstanceId, kaleoTimerId);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken getKaleoTimerInstanceToken(
		long kaleoInstanceId, long kaleoTimerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getKaleoTimerInstanceToken(kaleoInstanceId, kaleoTimerId);
	}

	public static int getKaleoTimerInstanceTokensCount(long kaleoInstanceId,
		java.lang.Boolean completed,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getKaleoTimerInstanceTokensCount(kaleoInstanceId,
			completed, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static KaleoTimerInstanceTokenLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					KaleoTimerInstanceTokenLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					KaleoTimerInstanceTokenLocalService.class.getName(),
					portletClassLoader);

			_service = new KaleoTimerInstanceTokenLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(KaleoTimerInstanceTokenLocalServiceUtil.class,
				"_service");
			MethodCache.remove(KaleoTimerInstanceTokenLocalService.class);
		}

		return _service;
	}

	public void setService(KaleoTimerInstanceTokenLocalService service) {
		MethodCache.remove(KaleoTimerInstanceTokenLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(KaleoTimerInstanceTokenLocalServiceUtil.class,
			"_service");
		MethodCache.remove(KaleoTimerInstanceTokenLocalService.class);
	}

	private static KaleoTimerInstanceTokenLocalService _service;
}