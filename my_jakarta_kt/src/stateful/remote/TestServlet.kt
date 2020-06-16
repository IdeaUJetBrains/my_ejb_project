/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2013 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package stateful.remote

import jakarta.ejb.EJB
import jakarta.servlet.ServletException
import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import java.io.IOException

/**
 * @author Arun Gupta
 */
@WebServlet(urlPatterns = ["/TestServletWithInterface"])
class TestServlet : HttpServlet() {
    // Cannot be injected using @Inject
    @EJB
    var bean: Cart? = null

    /**
     * Processes requests for both HTTP `GET` and `POST`
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Throws(ServletException::class, IOException::class)
    protected fun processRequest(request: HttpServletRequest?, response: HttpServletResponse) {
        response.contentType = "text/html;charset=UTF-8"
        response.writer.use { out ->
            out.println("<!DOCTYPE html>")
            out.println("<html>")
            out.println("<head>")
            out.println("<title>Adding/Removing items from Stateful Bean (with Interface)</title>")
            out.println("</head>")
            out.println("<body>")
            out.println("<h1>Adding/Removing items from Stateful Bean (with Interface)</h1>")
            out.println("<h2>Adding items</h2>")
            bean!!.addItem("apple")
            bean!!.addItem("banana")
            bean!!.addItem("mango")
            bean!!.addItem("kiwi")
            bean!!.addItem("passion fruit")
            out.println("added")
            out.println("<h2>Listing items</h2>")
            out.println(bean.getItems())
            out.println("<h2>Removing item</h2>")
            bean!!.removeItem("banana")
            out.println("removed")
            out.println("<h2>Listing items</h2>")
            out.println(bean.getItems())
            out.println("</body>")
            out.println("</html>")
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP `GET` method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Throws(ServletException::class, IOException::class)
    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        processRequest(request, response)
    }

    /**
     * Handles the HTTP `POST` method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Throws(ServletException::class, IOException::class)
    override fun doPost(request: HttpServletRequest, response: HttpServletResponse) {
        processRequest(request, response)
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    override fun getServletInfo(): String {
        return "Short description"
    } // </editor-fold>
}