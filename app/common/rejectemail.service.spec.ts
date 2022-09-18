import { TestBed } from '@angular/core/testing';

import { RejectemailService } from './rejectemail.service';

describe('RejectemailService', () => {
  let service: RejectemailService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RejectemailService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
