package life.majiang.community.cache;

import life.majiang.community.dto.TagDTO;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TagCache {
    public static List<TagDTO> get() {
        List<TagDTO> tagDTOS = new ArrayList<>();
        TagDTO front = new TagDTO();
        front.setCategoryName("前端");
        front.setTags(Arrays.asList("javascript", "typescript", "html", "html5", "node.js", "npm", "react.js", "vue.js", "angular", "chrome", "safari", "webkit", "chrome-devtools", "edge", "bootstrap", "tailwind-css", "antd", "sass", "less", "fiddler", "postcss", "yarn", "postman", "css3"));
        tagDTOS.add(front);
        TagDTO back = new TagDTO();
        back.setCategoryName("后端");
        back.setTags(Arrays.asList("php", "lavarel", "swoole", "java", "spring", "springboot", "node.js", ".python", "express", "fastapi", "ruby", "ruby-on-rails", "asp.net", "爬虫", "scala", "rust", "flask", "django"));
        tagDTOS.add(back);
        TagDTO data = new TagDTO();
        data.setCategoryName("数据");
        data.setTags(Arrays.asList("mysql","mariadb","postgresql","sqlite","sql","redis","mongodb","yaml","xml","nosql","json","elasticsearch","memcached"));
        tagDTOS.add(data);
        TagDTO tools = new TagDTO();
        tools.setCategoryName("工具");
        tools.setTags(Arrays.asList("github","visual-studio","git","visual-studio-code","pycharm","intellij-idea","sublime-text","webstorm","goland","phpstorm","vim","emacs"));
        tagDTOS.add(tools);
        return tagDTOS;
    }
    public  static String filterInvalid(String tags) {
        String[] split = StringUtils.split(tags, ",");
        List<TagDTO> tagDTOS = get();
        List<String> tagList = tagDTOS.stream().flatMap(tag -> tag.getTags().stream()).collect(Collectors.toList());
        String invalid = Arrays.stream(split).filter(t -> !tagList.contains(t)).collect(Collectors.joining( ","));
        return invalid;
    }
}