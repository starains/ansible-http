package org.januslabs.ansible.http.endpoints;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties("ansible")
@Component
/*ansible.basedir.location=/usr/local/bin
ansible.playbook.cmd=ansible-playbook
ansible.ping.playbook.name=hello.yml
ansible.playbookdir.location=/Users/nandhuAEB
*/
public class AnsibleConfiguration {

  @Value("${ansible.basedir.location}")
  private String ansibleLocation;
  @Value("${ansible.playbookdir.location}")
  private String playbookLocation;
  @Value("${ansible.ping.playbook.name}")
  private String pingPlaybook;
  @Value("${ansible.playbook.cmd}")
  private String playbookCommand;
}
