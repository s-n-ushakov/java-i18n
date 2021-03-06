/* This file is encoded as UTF-8 */

package com.sun.java.swing.plaf.windows.resources;

import java.util.ListResourceBundle;

/**
 * <p>Resource bundle for the Windows Look and Feel with "ru" locale.</p>
 * <p>Composed using "windows.properties" and "windows_ja.properties" files from
 * "com.sun.java.swing.plaf.windows.resources" package of OpenJDK 8 as
 * prototypes.</p>
 * <p>Currently, the following components need this for support:</p>
 * <ul>
 * <li>FileChooser</li>
 * </ul>
 * <p>MNEMONIC NOTE:</p>
 * <p>Refer to the note in basic_ru.java for a description as to what the
 * mnemonics correspond to and how to calculate them.</p>
 * 
 * @author Steve Wilson
 * @author darkbarker ( https://github.com/darkbarker )
 * @author Sergey Ushakov ( https://github.com/s-n-ushakov , s-n-ushakov@yandex.ru )
 */
public final class windows_ru extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            // ############ FILE CHOOSER STRINGS #############
            { "FileChooser.lookInLabel.textAndMnemonic", "Папка (&I):" }, // Look &in:
            { "FileChooser.saveInLabel.textAndMnemonic", "Папка:" }, // Save in: // no native equivalent in Windows 8.1
            { "FileChooser.fileNameLabel.textAndMnemonic", "Имя файла (&N):" }, // File &name:
            { "FileChooser.folderNameLabel.textAndMnemonic", "Имя папки (&N):" }, // Folder &name:
            { "FileChooser.filesOfTypeLabel.textAndMnemonic", "Тип файла (&T):" }, // Files of &type: // wording verified against Windows 8.1 native dialog
            { "FileChooser.upFolderToolTip.textAndMnemonic", "Переход на один уровень вверх" }, // Up One Level // Windows 8.1 native dialog has "Вверх до {parent_folder_name}"
            { "FileChooser.upFolderAccessibleName", "Вверх" }, // Up
            { "FileChooser.homeFolderToolTip.textAndMnemonic", "Домашняя папка" }, // Home
            { "FileChooser.homeFolderAccessibleName", "Домашняя папка" }, // Home
            { "FileChooser.newFolderToolTip.textAndMnemonic", "Создание папки" }, // Create New Folder // wording verified against Windows 8.1 native dialog
            { "FileChooser.newFolderAccessibleName", "Новая папка" }, // New Folder
            { "FileChooser.newFolderActionLabel.textAndMnemonic", "Новая папка" }, // New Folder
            { "FileChooser.listViewButtonToolTip.textAndMnemonic", "Список" }, // List
            { "FileChooser.listViewButtonAccessibleName", "Список" }, // List
            { "FileChooser.listViewActionLabel.textAndMnemonic", "Список" }, // List
            { "FileChooser.detailsViewButtonToolTip.textAndMnemonic", "Таблица" }, // Details
            { "FileChooser.detailsViewButtonAccessibleName", "Таблица" }, // Details
            { "FileChooser.viewMenuButtonToolTipText", "Вид" }, // View Menu
            { "FileChooser.viewMenuButtonAccessibleName", "Вид" }, // View Menu
            { "FileChooser.detailsViewActionLabel.textAndMnemonic", "Таблица" }, // Details
            { "FileChooser.refreshActionLabel.textAndMnemonic", "Обновить" }, // Refresh
            { "FileChooser.viewMenuLabel.textAndMnemonic", "Вид" }, // View
            { "FileChooser.fileNameHeader.textAndMnemonic", "Имя" }, // Name
            { "FileChooser.fileSizeHeader.textAndMnemonic", "Размер" }, // Size
            { "FileChooser.fileTypeHeader.textAndMnemonic", "Тип" }, // Type
            { "FileChooser.fileDateHeader.textAndMnemonic", "Изменён" }, // Modified
            { "FileChooser.fileAttrHeader.textAndMnemonic", "Атрибуты" }, // Attributes
        };
    }
}
